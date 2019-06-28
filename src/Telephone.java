public class Telephone
{
    private String officeAreaCode;
    private String number;

    public Telephone() {}

    public Telephone(String officeAreaCode, String number)
    {
        this.officeAreaCode = officeAreaCode;
        this.number = number;
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

    public String getTelephone()
    {
        return this.officeAreaCode + " " + this.number;
    }
}
