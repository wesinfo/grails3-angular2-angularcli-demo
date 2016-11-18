package ng2starter

import grails.persistence.Entity

@Entity
class Users {
    String username;
    String password;

    static mapping = {
        id name: 'username'
    }
}
