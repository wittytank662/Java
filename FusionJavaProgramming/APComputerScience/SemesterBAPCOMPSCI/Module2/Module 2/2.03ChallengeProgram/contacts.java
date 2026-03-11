public class contacts {
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;

    public contacts(String n, String r, String b, String p, String e) {
        name = n;
        relation = r;
        birthday = b;
        phone = p;
        email = e;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Setters

    public void setName(String n) {
        name = n;
    }

    public void setRelation(String r) {
        relation = r;
    }

    public void setBirthday(String b) {
        birthday = b;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public void setEmail(String e) {
        email = e;
    }

    // toString method

    public String toString() {
        String str = String.format("%-25s %-12s %-12s %-16s %-30s", name, relation, birthday, phone, email);
        return str;
    }
}
