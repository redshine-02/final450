package main

import (
	"html/template"
	"net/http"
	"log"
)

type Subdepartment struct {
	Value string
	Label string
}

type Timeline struct {
	Value string
	Label string
}

type Table struct {
	Title    string
	Headings []string
	Rows     [][]string
}

type Data struct {
	Subdepartments []Subdepartment
	Timelines      []Timeline
	Tables         []Table
}

func renderHTML(w http.ResponseWriter, r *http.Request) {
	data := Data{
		Subdepartments: []Subdepartment{
			{Value: "subdept1", Label: "Subdepartment 1"},
			{Value: "subdept2", Label: "Subdepartment 2"},
			{Value: "subdept3", Label: "Subdepartment 3"},
		},
		Timelines: []Timeline{
			{Value: "t1", Label: "Timeline 1"},
			{Value: "t2", Label: "Timeline 2"},
			{Value: "t3", Label: "Timeline 3"},
		},
		Tables: []Table{
			{
				Title:    "Table 1",
				Headings: []string{"KPI1", "KPI2", "KPI3", "KPI4"},
				Rows: [][]string{
					{"Subdept 1", "Data 1", "Data 2", "Data 3", "Data 4"},
					{"Subdept 2", "Data 5", "Data 6", "Data 7", "Data 8"},
					// Add more rows as needed
				},
			},
			{
				Title:    "Table 2",
				Headings: []string{"KPI1", "KPI2", "KPI3", "KPI4"},
				Rows: [][]string{
					{"Subdept 3", "Data 9", "Data 10", "Data 11", "Data 12"},
					{"Subdept 4", "Data 13", "Data 14", "Data 15", "Data 16"},
					// Add more rows as needed
				},
			},
		},
	}

	tmpl, err := template.ParseFiles("index.html")
	if err != nil {
		log.Fatal(err)
	}

	err = tmpl.Execute(w, data)
	if err != nil {
		log.Fatal(err)
	}
}

func main() {
	http.HandleFunc("/", renderHTML)
	http.ListenAndServe(":8080", nil)
}
