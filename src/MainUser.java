public class MainUser {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("mk", "ii");
        uc.addUser("kk", "mk");
        uc.addUser("hy", "yt");
        uc.addUser("uy", "io");
        uc.addUser("uy", "io");
        uc.deleteUser ("mk");
        uc.deleteUser ("sss");
        uc.showUsers();

        uc.changePassword(
                "kk",
                "mk",
                "yyy",
                "yyy");

        uc.showUsers();

    }
}
