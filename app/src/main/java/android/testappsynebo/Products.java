package android.testappsynebo;

import android.graphics.Bitmap;

/**
 * Created by Sola2Be on 14.10.2015.
 */
public class Products {

    public class Attributes {
        private String type;

        private String url;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    private Attributes attributes;

    private String Description;

    private String Description__c;

    private boolean EDY_ORGCUSTOM__DB__c;

    private String Family;

    private boolean Featured_Product__c;

    private String Id;

    private String ID_for_Org_Customizer__c;

    private String Image_Url__c;

    private boolean IsActive;

    private boolean IsDeleted;

    private boolean Is_New_Product__c;

    private String LastModifiedById;

    private String LastModifiedDate;

    private String Name;

    private float Price__c;

    private String ProductCode;

    private String  purl__c;

    private float Rate__c;

    private String RecordTypeId;

    private int Stock__c;

    private Bitmap img;

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDescription__c() {
        return Description__c;
    }

    public void setDescription__c(String description__c) {
        Description__c = description__c;
    }

    public boolean isEDY_ORGCUSTOM__DB__c() {
        return EDY_ORGCUSTOM__DB__c;
    }

    public void setEDY_ORGCUSTOM__DB__c(boolean EDY_ORGCUSTOM__DB__c) {
        this.EDY_ORGCUSTOM__DB__c = EDY_ORGCUSTOM__DB__c;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public boolean isFeatured_Product__c() {
        return Featured_Product__c;
    }

    public void setFeatured_Product__c(boolean featured_Product__c) {
        Featured_Product__c = featured_Product__c;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getID_for_Org_Customizer__c() {
        return ID_for_Org_Customizer__c;
    }

    public void setID_for_Org_Customizer__c(String ID_for_Org_Customizer__c) {
        this.ID_for_Org_Customizer__c = ID_for_Org_Customizer__c;
    }

    public String getImage_Url__c() {
        return Image_Url__c;
    }

    public void setImage_Url__c(String image_Url__c) {
        Image_Url__c = image_Url__c;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setIsActive(boolean isActive) {
        IsActive = isActive;
    }

    public boolean isDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        IsDeleted = isDeleted;
    }

    public boolean is_New_Product__c() {
        return Is_New_Product__c;
    }

    public void setIs_New_Product__c(boolean is_New_Product__c) {
        Is_New_Product__c = is_New_Product__c;
    }

    public String getLastModifiedById() {
        return LastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        LastModifiedById = lastModifiedById;
    }

    public String getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice__c() {
        return Price__c;
    }

    public void setPrice__c(float price__c) {
        Price__c = price__c;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getPurl__c() {
        return purl__c;
    }

    public void setPurl__c(String purl__c) {
        this.purl__c = purl__c;
    }

    public float getRate__c() {
        return Rate__c;
    }

    public void setRate__c(float rate__c) {
        Rate__c = rate__c;
    }

    public String getRecordTypeId() {
        return RecordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        RecordTypeId = recordTypeId;
    }

    public int getStock__c() {
        return Stock__c;
    }

    public void setStock__c(int stock__c) {
        Stock__c = stock__c;
    }
}
