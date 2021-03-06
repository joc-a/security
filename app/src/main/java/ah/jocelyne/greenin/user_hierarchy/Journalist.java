package ah.jocelyne.greenin.user_hierarchy;

import ah.jocelyne.greenin.signup.RegisteredUser;

public class Journalist extends RegisteredUser implements Role{

    public Journalist (String firstName, String lastName, String email, String hashedPassword, String salt, String role) {
        super(firstName, lastName, email, hashedPassword, salt, role);
    }

    public void addArticle(){}
    public void editArticle(){}
    public void deleteArticle(){}

    public void invokeMyFunctions()
    {
        addArticle();
        editArticle();
        deleteArticle();
    }

    public invokeMyChildrenFunctions() {
        //Explanation: List mychildren = TreeNodeObject.getChildren();
        getChildren().invokeMyFunctions();
    }
}
