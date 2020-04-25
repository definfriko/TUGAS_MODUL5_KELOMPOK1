package tugas_modul5_kel1;

public class userService {
	private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles = "";
    private String emailbaru, buku1, buku2, tanggal;
    
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"definkelompok1@gmail.com", "12345", "superAdmin"},
            {"ghalykelompok1@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"definkelompok1@gmail.com","Fisika Dasar","Dasar Komputer dan Pemrograman","25-04-2020"},
            {"ghalykelompok1@gmail.com","Dasar Komputer dan Pemrograman","Konsep Jaringan Komputer","25-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    emailbaru = histories[i][0];
                    buku1 = histories[i][1];
                    buku2 = histories[i][2];
                    tanggal = histories[i][3];
                    roles = data[1][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + emailbaru);
            System.out.println(email + " meminjam buku : ");
            System.out.println(buku1);
            System.out.println(buku2);
            System.out.println("Tanggal Pinjaman : " + tanggal);
        }
        else
        {
            System.out.println("\nInvalid Login ");

        }
    }
}
