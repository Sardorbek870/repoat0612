package com.company.online_president_saylovi;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.frontend.ui.MainUI;

public class OnlinePrezidentElectionDemo {
    public static void main(String[] args) {
        Database.dataLoad();

        MainUI mainUI = new MainUI();
        mainUI.authWindow();

    }
}
