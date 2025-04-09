# Inheritance
Displays knowledge of inheritance in Java

## App 
* Creates 2 **EmbeddedCourse** objects
  * 1 object using the no-parameter constructor
  * 1 object using the full-parameter constructor
* Displays the data of the 2 objects 

## Address
**Attributes**\
int number\
String street\
String city\
String state\
int zipcode

## Course
**Attributes**\
CourseName name\
int credits\
String description\
boolean genEd\
String genEdType

## CourseName
**Attributes**\
String major\
int number

## EmbeddedCourse
**Attributes**\
ForeignAddress place\
Professor supervisor

## ForeignAddress
**Attributes**\
String country

## Person
**Attributes**\
String name\
int age\
Address homeAddress

## Professor
**Attributes**\
String college\
String expertise
