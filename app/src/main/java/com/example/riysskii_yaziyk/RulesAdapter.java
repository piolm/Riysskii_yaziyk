package com.example.riysskii_yaziyk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.List;
import java.util.zip.Inflater;

public class RulesAdapter extends RecyclerView.Adapter<RulesAdapter.ViewHolder> {
    public static class RuleBurh {
        public String name;
        public String rule;

        public RuleBurh(String name, String rule) {
            this.name = name;
            this.rule = rule;
        }
    }
    private final LayoutInflater inflater;
    private final List<RuleBurh> rules;

    public RulesAdapter(Context ctx, List<RuleBurh> rules) {
        this.inflater = LayoutInflater.from(ctx);
        this.rules = rules;
    }

    @NonNull
    @Override
    public RulesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rules, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RulesAdapter.ViewHolder holder, int position) {
        RuleBurh rule = rules.get(position);
        holder.name.setText(rule.name);
        holder.ruleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(inflater.getContext(), rule.rule, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return rules.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView name;
        final LinearLayout ruleLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.rule);
            this.ruleLayout = itemView.findViewById(R.id.rule_copy);
        }
    }
}
