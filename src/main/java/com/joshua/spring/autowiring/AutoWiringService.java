package com.joshua.spring.autowiring;

/**
 * Created by herendh on 8/26/16.
 */
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word){
        this.autoWiringDAO.say(word);
    }
}
