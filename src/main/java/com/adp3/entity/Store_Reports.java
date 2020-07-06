package com.adp3.entity;
/*
*Zangwa Steve
* 217136664
* Class Description : StoreReport
* Using builder pattern
 */

public class Store_Reports {
    private String ReportID,ReportDesc, StoredID;

    private Store_Reports(Store_Reports builder){
        this.ReportID = builder.ReportID;
        this.StoredID = builder.StoredID;
         this.ReportDesc = builder.ReportDesc;

    }
    public String getReportID() {
        return ReportID;
    }

    public String getReportDesc() {
        return ReportDesc;
    }

    public String getStoredID() {
        return StoredID;
    }

    @Override
    public String toString() {
        return "Store_Reports{" +
                "ReportID='" + ReportID + '\'' +
                ", ReportDesc='" + ReportDesc + '\'' +
                ", StoredID='" + StoredID + '\'' +
                '}';
    }

    public void setReportID(String reportID) {
        ReportID = reportID;
    }

    public void setReportDesc(String reportDesc) {
        ReportDesc = reportDesc;
    }

    public void setStoredID(String storedID) {
        StoredID = storedID;
    }


    public static class Builder {
        public String ReportID;
        public String StoredID;
        private String ReportDesc;

        public void setReportID(String reportID) {
            ReportID = reportID;
        }

        public void setReportDec(String reportDec) {
            ReportDesc = reportDec;
        }

        public void setStoredID(String storedID) {
            StoredID = storedID;
        }
        public Builder copy (Store_Reports store_reports){
            this.ReportID = store_reports.ReportID;
            this.StoredID = store_reports.StoredID;
            this.ReportDesc = store_reports.ReportDesc;
           return this;
        }
    }


    public Store_Reports build() {  return new Store_Reports(this);
    }

private void generateReports(){

}
}


