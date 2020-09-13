package homework5;


class Coworker {
    String name;
    String position;
    String email;
    String phone;
    int wage;
    int age;

    Coworker(String name, String position, String email, String phone, int wage, int age)
    {
        this.name= name;
        this.position= position;
        this.email= email;
        this.phone= phone;
        this.wage= wage;
        this.age= age;
    }
    public String toString(){
        return "Имя: " + name + " Должность: " + position + " Email: " + " Номер телефона: " + phone + " Зарплата: " + wage + " Возраст " + age;
    }




}
