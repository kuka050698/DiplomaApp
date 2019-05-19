package com.example.diploma

import java.io.Serializable

class ID : Serializable{

    var Allergies:String?
    var Name: String?
    var Surname: String?
    var Surgeries: String?
    var Blood_group: Long?
    var Current_State: String?
    var Medical_History: String?
    var Rhesus_factor: String?
    var Implanted_devices: String?
    var Vaccine_date: Long?
    var Medications: String?
    var Company_number: String?
    var Occupation_doctor:String?
    var Doctor_name:String?
    var Chronic_diseases:String?
    var Clinic:String?

    init {
        this.Allergies = ""
        this.Name = ""
        this.Surname = ""
        this.Surgeries = ""
        this.Blood_group = 0L
        this.Current_State = ""
        this.Medical_History = ""
        this.Rhesus_factor = ""
        this.Implanted_devices = ""
        this.Vaccine_date = 0L
        this.Medications = ""
        this.Company_number = ""
        this.Occupation_doctor = ""
        this.Doctor_name = " "
        this.Chronic_diseases = ""
        this.Clinic = ""






    }

}