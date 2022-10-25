package edu.uga.cs.jobstrackerfirebase;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * This is an adapter class for the RecyclerView to show all job leads.
 */
public class JobLeadRecyclerAdapter extends RecyclerView.Adapter<JobLeadRecyclerAdapter.JobLeadHolder> {

    public static final String DEBUG_TAG = "JobLeadRecyclerAdapter";

    private List<JobLead> jobLeadList;

    public JobLeadRecyclerAdapter( List<JobLead> jobLeadList ) {
        this.jobLeadList = jobLeadList;
    }

    // The adapter must have a ViewHolder class to "hold" one item to show.
    class JobLeadHolder extends RecyclerView.ViewHolder {

        TextView companyName;
        TextView phone;
        TextView url;
        TextView comments;

        public JobLeadHolder(View itemView ) {
            super(itemView);

            companyName = (TextView) itemView.findViewById( R.id.companyName );
            phone = (TextView) itemView.findViewById( R.id.phone );
            url = (TextView) itemView.findViewById( R.id.url );
            comments = (TextView) itemView.findViewById( R.id.comments );
        }
    }

    @Override
    public JobLeadHolder onCreateViewHolder( ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.job_lead, parent, false );
        return new JobLeadHolder( view );
    }

    // This method fills in the values of the Views to show a JobLead
    @Override
    public void onBindViewHolder( JobLeadHolder holder, int position ) {
        JobLead jobLead = jobLeadList.get( position );

        Log.d( DEBUG_TAG, "onBindViewHolder: " + jobLead );

        holder.companyName.setText( jobLead.getCompanyName());
        holder.phone.setText( jobLead.getPhone() );
        holder.url.setText( jobLead.getUrl() );
        holder.comments.setText( jobLead.getComments() );
    }

    @Override
    public int getItemCount() {
        return jobLeadList.size();
    }
}
