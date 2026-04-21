import java.util.Scanner;

class MyHr
{
    public static void main(String[] args) 
    {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        Office office[]= new Office[3];
        Employee emp[]= new Employee[5];
        for(int officeInx=0;officeInx<3;officeInx++)
        //initialize 3 offices instantly
        {
            office[officeInx]=new Office();
        }
        while(choice!=4)
        //so the code stops when exit is selected
        {
            System.out.print("Pick an option: ");
            System.out.print("\n1. List all offices: ");
            System.out.print("\n2. Create a new employee record: ");
            System.out.print("\n3. List all employee records: ");
            System.out.print("\n4. Exit\n");
            choice = input.nextInt();
            switch(choice)
                {
                case 1:
                    for(Office off:office)
                    {
                        System.out.println(off+"\t"+"Employees in this offcie: "+off.getOccCount());
                        if (off.getOccCount()!=0)
                        {
                            System.out.println("Employees: \n"+off.empDetails());
                        }
                    }
                    break;
                    case 2:
                        if (Employee.empCount<5)
                        {
                            String fName;
                            String surname;
                            String street;
                            String city;
                            String county;
                            String empType;
                            String comCar=null;
                            Scanner inEmp = new Scanner(System.in);
                            System.out.println("Enter the first name of the employee: ");
                            fName = inEmp.nextLine();
                            System.out.println("Enter the last name of the employee: ");
                            surname = inEmp.nextLine();
                            System.out.println("Enter the street of the employee: ");
                            street = inEmp.nextLine();
                            System.out.println("Enter the city of the employee: ");
                            city = inEmp.nextLine();
                            System.out.println("Enter the county of the employee: ");
                            county = inEmp.nextLine();
                            System.out.println("Enter the employee type of the employee: ");
                            empType = inEmp.nextLine();
                            if (empType.equalsIgnoreCase("manager"))
                            //so only managers get this prompt
                            {
                                System.out.println("Enter the employee company car of the employee: ");
                                comCar = inEmp.nextLine();
                            }
                            Address add= new Address(street,city,county);
                            Employee emps=new Employee(fName,surname,empType);
                            emps.setCompCar(comCar);
                            emps.setAddress(add);
                            //initialized the address
                            emp[Employee.empCount]=emps;
                            for(Office off:office)
                            {
                                if(off.getOccCount()<2)
                                {
                                    off.assignEmp(emps);
                                    break;
                                }
                            }
                        }
                        break;
                        case 3:
                        for (Employee employee:emp)
                        {
                            if (employee!=null)
                            {
                                System.out.println(employee);
                            }
                        }
                        break;
                        case 4:
                            choice = 4;
                }
        }
    }
}

class Employee
{
    Office assignedOffice;
    private Address address;;
    static int empNumber=1000;
    int currentEmp;
    public static int empCount=0;
    String fName;
    String surname;
    String empType;
    String compCar;

    public Employee(String fName, String surname, String empType)
    {
        if(empCount<5)
        {
            setFName(fName);
            setSurname(surname);
            setEmpType(empType);
            setCompCar(compCar);
            currentEmp=empNumber;
            empNumber++;
            empCount++;
        }
        else
        {
            System.out.println("You already made 5 employee records");
        }
    }
    public void setFName(String name)
    {
        this.fName = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setEmpType(String empType)
    {
        this.empType = empType;
    }
    public void setCompCar(String compCar)
    {
        this.compCar = compCar;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public String getCompCar()
    {
        return compCar;
    }
    public String getfName()
    {
        return fName;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getEmpCount()
    {
        return empCount;
    }
    public int  getEmpNumber()
    {
        return empNumber;
    }
    public String getEmpType()
    {
        return empType;
    }
    public int empCount()
    {
        return empCount;
    }
    public Address getAddress()
    {
        return address;
    }

    public String toString()
    {
        String result= currentEmp + "\n First name: " + fName + "\n Last name: " + surname + "\n empType: " + empType;
        if(empType.equalsIgnoreCase("manager"))
        {
            result= currentEmp+"\n First name: "+fName+"\n Last name: "+surname+"\n empType: "+empType+"\n compCar: "+compCar;
        }
        if(address != null)
        {
            result += "\n Room: "+assignedOffice.getRoomNumber()+"\n Street: " + address.getStreet() + "\n City: " +address.getCity() + "\n County: " + address.getCounty();
        }




        return result;
    }
}

class Address extends Object
{
    public String street;
    public String city;
    public String county;
    public Address (String street, String city, String county)
    {
        setCity(city);
        setCounty(county);
        setStreet(street);
    }
    public void setCity(String city)
    {
        this.city=city;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCounty()
    {
        return county;
    }
}

class Office
{
    int occCount=0;
    static int roomNumber=100;
    int currentRoom;
    Employee occupant[]=new Employee[2];
    public Office()
    {
        currentRoom=roomNumber;
        roomNumber++;
    }

    public void assignEmp(Employee emp)
    {
        if (occCount < 2)
        {
            occupant[occCount]= emp;
            emp.assignedOffice = this;
            occCount++;
        }
        else
        {
            System.out.println("You can't assign more than 2 employees to 1 office");
        }
    }
    public String empDetails()
    {
        String details="";
        for (Employee emp : occupant)
        {
            if (emp!=null)
            {
                details+=emp.getEmpNumber()+" "+" "+emp.getfName()+emp.getSurname()+" ";
            }
        }
        return details;
    }
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber=roomNumber;
    }
    public int getRoomNumber()
    {
        return currentRoom;
    }
    public int getOccCount()
    {
        return occCount;
    }
    public String toString()
    {
        return "Office[roomNumber=" + currentRoom + "]\n";
    }
}