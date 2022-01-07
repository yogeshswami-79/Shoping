package com.icmi.Shoping.Activities.OrderHistory;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.R;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryActivity extends BaseActivity {
    private RecyclerView rv;
    private View noResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        initView();

        setResult(new ArrayList<>());

    }

    private void initView() {
        rv = findViewById(R.id.rv_orders);
        noResult = findViewById(R.id.view_no_result);
    }


    void setResult(@NonNull List<?> result) {
        if (!(result.size() > 0)) {
            noResult();
            return;
        }
    }

    private void noResult() {
        noResult.setVisibility(View.VISIBLE);
        rv.setVisibility(View.GONE);
    }

    private void showResultView() {
        rv.setVisibility(View.VISIBLE);
        noResult.setVisibility(View.GONE);
    }

}
