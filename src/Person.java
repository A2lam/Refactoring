public class Person
{
    private String prenom;
    private String nom;
    private String officeAreaCode;
    private String number;

    public Person() {}

    public Person(String prenom, String nom)
    {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getOfficeAreaCode()
    {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode)
    {
        this.officeAreaCode = officeAreaCode;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getName()
    {
        return this.nom + " " + this.prenom;
    }

    public String getTelephoneNumber()
    {
        return this.officeAreaCode + " " + this.number;
    }
}
