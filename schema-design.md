
//------------------------------------------------------------------------------------------------------------------------

MySQL Database Design;

A classic relational database for storing and accessing well-structured data that can be organized into tables. 
We have four tables: patients, doctors, appointments, and admins.

1) Table: Patients;
   
   Column        |   Data type      |   Constraints
   patient_id    |    int           |     unique, auto-increment
   name          |    varchar(100)  |     not null
   email         |    varchar(100)  |     not null, unique
   phone_number  |    varchar(16)   |     not null, unique
   date_of_birth |    date          |     not null
   sex           |    varchar(12)   |     'M' or 'F'


2) Table: Doctors;
   
   Column         |  Data type       |   Constraints
   doctor_id      |    int           |     unique, auto-increment
   name           |    varchar(100)  |     not null
   email          |    varchar(100)  |     not null, unique
   phone_number   |    varchar(16)   |     not null, unique
   specialization |    varchar(100)  |     not null
   active         |    boolean       |     true or false


3) Table: Appointments;
   
   Column             |  Data type       |   Constraints
   appointment_id     |    int           |     unique, auto-increment
   patient_id         |    int           |     unique
   doctor_id          |    int           |     unique
   appointment_time   |    datetime      |     not null
   status             |    int           |     0 = scheduled 1 = completed; 2 = cancelled;


4) Table: Admin;
   
   Column          |  Data type       |   Constraints
   admin_id        |    int           |     unique, auto-increment
   username        |    varchar(100)  |     unique, not null
   password        |    varchar(100)  |     not null
   phone_number    |    varchar(16)   |     not null, unique

//------------------------------------------------------------------------------------------------------------------------

MongoDB Collection Design;

For all data that is dynamic and cannot be organized well into tables, we use MongoDB.

JSON

{
  "_id": "object_id('61faac91234d')",
  "patient_id": 17,
  "doctor_id": 5,
  "appointment_id": 36,
  "patientName": "Nate Johnson",
  "medications": [
  
      {
        "name": "C vitamin",
        "dosage": " "300 mg",
        "frequency": " 2-3 times a day",
        "duration" : " 3 months" 
      },

      {
        "name": "Xanax",
        "dosage": "0,5 mg",
        "frequency": " 2 times a day",
        "duration": "  3 months"
      }
    
  ]
  "doctorNotes": "Advise active sports and avoid drinking and cigarettes.",
  "pharmacy": {
    "name": "Snake Pharmacy",
    "location": "424 Los Angeles, Baker Street 45"
  },
  "metadata": {
    "written by": "Dr. Amabel Anderson",
    "signedDigitally": true
  }
}

