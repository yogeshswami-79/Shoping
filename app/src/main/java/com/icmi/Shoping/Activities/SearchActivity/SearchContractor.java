package com.icmi.Shoping.Activities.SearchActivity;

import java.util.List;

public interface SearchContractor {
    interface View{
        void onResult(List<String> result);
    }
    interface Presenter{

    }
}
