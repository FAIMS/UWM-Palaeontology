package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Column
     */
    public static View get_Column(Solo solo) {
        String ref = "Column";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Sample
     */
    public static View get_Sample(Solo solo) {
        String ref = "Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Unit
     */
    public static View get_Unit(Solo solo) {
        String ref = "Unit";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: map
        Ref:  Control/Map
     */
    public static View get_Control_Map(Solo solo) {
        String ref = "Control/Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Column/Description
     */
    public static View get_Column_Description(Solo solo) {
        String ref = "Column/Description";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Column/Units
     */
    public static View get_Column_Units(Solo solo) {
        String ref = "Column/Units";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/IDS
     */
    public static View get_Control_IDS(Solo solo) {
        String ref = "Control/IDS";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Main
     */
    public static View get_Control_Main(Solo solo) {
        String ref = "Control/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Search
     */
    public static View get_Control_Search(Solo solo) {
        String ref = "Control/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Login
     */
    public static View get_Login_Login(Solo solo) {
        String ref = "Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Sample/Info
     */
    public static View get_Sample_Info(Solo solo) {
        String ref = "Sample/Info";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Unit/Main
     */
    public static View get_Unit_Main(Solo solo) {
        String ref = "Unit/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Unit/Samples
     */
    public static View get_Unit_Samples(Solo solo) {
        String ref = "Unit/Samples";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Column/Units/Create_New_Unit
     */
    public static View get_Column_Units_CreateNewUnit(Solo solo) {
        String ref = "Column/Units/Create_New_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Main/Create_New_Locality
     */
    public static View get_Control_Main_CreateNewLocality(Solo solo) {
        String ref = "Control/Main/Create_New_Locality";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Log_in
     */
    public static View get_Login_Login_Login(Solo solo) {
        String ref = "Login/Login/Log_in";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Sign_up
     */
    public static View get_Login_Login_Signup(Solo solo) {
        String ref = "Login/Login/Sign_up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Unit/Samples/Create_New_Sample
     */
    public static View get_Unit_Samples_CreateNewSample(Solo solo) {
        String ref = "Unit/Samples/Create_New_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/Login/Users
     */
    public static View get_Login_Login_Users(Solo solo) {
        String ref = "Login/Login/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Attach_Sketch
     */
    public static EditText get_Column_Description_AttachSketch(Solo solo) {
        String ref = "Column/Description/Attach_Sketch";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Author
     */
    public static View get_Column_Description_Author(Solo solo) {
        String ref = "Column/Description/Author";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Column_ID
     */
    public static EditText get_Column_Description_ColumnID(Solo solo) {
        String ref = "Column/Description/Column_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Description
     */
    public static EditText get_Column_Description_Description(Solo solo) {
        String ref = "Column/Description/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Easting
     */
    public static View get_Column_Description_Easting(Solo solo) {
        String ref = "Column/Description/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Latitude
     */
    public static View get_Column_Description_Latitude(Solo solo) {
        String ref = "Column/Description/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Locality_Abbreviated_Name
     */
    public static EditText get_Column_Description_LocalityAbbreviatedName(Solo solo) {
        String ref = "Column/Description/Locality_Abbreviated_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Locality_Name
     */
    public static EditText get_Column_Description_LocalityName(Solo solo) {
        String ref = "Column/Description/Locality_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Location
     */
    public static EditText get_Column_Description_Location(Solo solo) {
        String ref = "Column/Description/Location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Longitude
     */
    public static View get_Column_Description_Longitude(Solo solo) {
        String ref = "Column/Description/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Northing
     */
    public static View get_Column_Description_Northing(Solo solo) {
        String ref = "Column/Description/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Section_Photo
     */
    public static EditText get_Column_Description_SectionPhoto(Solo solo) {
        String ref = "Column/Description/Section_Photo";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Thickness_in_cm
     */
    public static EditText get_Column_Description_Thicknessincm(Solo solo) {
        String ref = "Column/Description/Thickness_in_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Timestamp
     */
    public static View get_Column_Description_Timestamp(Solo solo) {
        String ref = "Column/Description/Timestamp";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Column/Description/Type
     */
    public static EditText get_Column_Description_Type(Solo solo) {
        String ref = "Column/Description/Type";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Entity_Types
     */
    public static EditText get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Author
     */
    public static View get_Sample_Info_Author(Solo solo) {
        String ref = "Sample/Info/Author";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Description_of_location
     */
    public static EditText get_Sample_Info_Descriptionoflocation(Solo solo) {
        String ref = "Sample/Info/Description_of_location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Locality_Abbreviated_Name
     */
    public static EditText get_Sample_Info_LocalityAbbreviatedName(Solo solo) {
        String ref = "Sample/Info/Locality_Abbreviated_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Location_from_top_of_unit_in_cm
     */
    public static EditText get_Sample_Info_Locationfromtopofunitincm(Solo solo) {
        String ref = "Sample/Info/Location_from_top_of_unit_in_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Photo_of_Location
     */
    public static EditText get_Sample_Info_PhotoofLocation(Solo solo) {
        String ref = "Sample/Info/Photo_of_Location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Sample_ID
     */
    public static EditText get_Sample_Info_SampleID(Solo solo) {
        String ref = "Sample/Info/Sample_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Sample_Label
     */
    public static EditText get_Sample_Info_SampleLabel(Solo solo) {
        String ref = "Sample/Info/Sample_Label";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Sample_Tag
     */
    public static EditText get_Sample_Info_SampleTag(Solo solo) {
        String ref = "Sample/Info/Sample_Tag";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Timestamp
     */
    public static View get_Sample_Info_Timestamp(Solo solo) {
        String ref = "Sample/Info/Timestamp";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sample/Info/Unit_ID
     */
    public static EditText get_Sample_Info_UnitID(Solo solo) {
        String ref = "Sample/Info/Unit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Author
     */
    public static View get_Unit_Main_Author(Solo solo) {
        String ref = "Unit/Main/Author";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Component_Type
     */
    public static EditText get_Unit_Main_ComponentType(Solo solo) {
        String ref = "Unit/Main/Component_Type";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Composition
     */
    public static EditText get_Unit_Main_Composition(Solo solo) {
        String ref = "Unit/Main/Composition";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Ends_at_in_cm
     */
    public static EditText get_Unit_Main_Endsatincm(Solo solo) {
        String ref = "Unit/Main/Ends_at_in_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Description
     */
    public static EditText get_Unit_Main_FossilDescription(Solo solo) {
        String ref = "Unit/Main/Fossil_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Percentage
     */
    public static EditText get_Unit_Main_FossilPercentage(Solo solo) {
        String ref = "Unit/Main/Fossil_Percentage";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Shape
     */
    public static EditText get_Unit_Main_FossilShape(Solo solo) {
        String ref = "Unit/Main/Fossil_Shape";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Size_in_cm
     */
    public static EditText get_Unit_Main_FossilSizeincm(Solo solo) {
        String ref = "Unit/Main/Fossil_Size_in_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Subtype
     */
    public static EditText get_Unit_Main_FossilSubtype(Solo solo) {
        String ref = "Unit/Main/Fossil_Subtype";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Fossil_Type
     */
    public static EditText get_Unit_Main_FossilType(Solo solo) {
        String ref = "Unit/Main/Fossil_Type";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Interpretation
     */
    public static EditText get_Unit_Main_Interpretation(Solo solo) {
        String ref = "Unit/Main/Interpretation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Locality_Abbreviated_Name
     */
    public static EditText get_Unit_Main_LocalityAbbreviatedName(Solo solo) {
        String ref = "Unit/Main/Locality_Abbreviated_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Rock_Type
     */
    public static EditText get_Unit_Main_RockType(Solo solo) {
        String ref = "Unit/Main/Rock_Type";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Starts_at_in_cm
     */
    public static EditText get_Unit_Main_Startsatincm(Solo solo) {
        String ref = "Unit/Main/Starts_at_in_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Timestamp
     */
    public static View get_Unit_Main_Timestamp(Solo solo) {
        String ref = "Unit/Main/Timestamp";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Unit_ID
     */
    public static EditText get_Unit_Main_UnitID(Solo solo) {
        String ref = "Unit/Main/Unit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Unit/Main/Unit_Photo
     */
    public static EditText get_Unit_Main_UnitPhoto(Solo solo) {
        String ref = "Unit/Main/Unit_Photo";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Column/Units/Existing_Units
     */
    public static View get_Column_Units_ExistingUnits(Solo solo) {
        String ref = "Column/Units/Existing_Units";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Main/Existing_Localities
     */
    public static View get_Control_Main_ExistingLocalities(Solo solo) {
        String ref = "Control/Main/Existing_Localities";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Unit/Samples/Existing_Samples
     */
    public static View get_Unit_Samples_ExistingSamples(Solo solo) {
        String ref = "Unit/Samples/Existing_Samples";
        return (android.view.View) solo.getView((Object) ref);
    }
}
