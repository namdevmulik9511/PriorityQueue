# Emergency Room Management System

This project is a simple implementation of an emergency room management system using a custom priority queue in Java.
The system prioritizes patients based on the severity of their condition and whether they arrived by ambulance.

## Features

- Patients arriving by ambulance are given the highest priority.
- Among patients who did not arrive by ambulance, those with higher severity are prioritized.
- A priority queue is used to manage the patients efficiently.

### Running the Program

1. Clone the repository or download the source code files.
2. Open the project in your preferred IDE or text editor.
3. Compile and run the `EmergencyRoom` class.

#### Output

EmergencyRoom ...
Patient [name=Somu, priority=1, arrivedByAmbulance=true]
Patient [name=Gomu, priority=4, arrivedByAmbulance=false]
Patient [name=Tomu, priority=3, arrivedByAmbulance=false]
Patient [name=Ramu, priority=2, arrivedByAmbulance=false]