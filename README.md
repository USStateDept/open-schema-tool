open-schema-tool
================
The core vision of this project is that in mnay cases, it isn't the tool that is sensistive - it is the data. By making data schemas shareable, we increase opportunities for creating open source tools, inter-agency opportunities, public collaboration, and a greater sense of openness.

The goal of this tool is to create a table of bogus data, but to do so while maintaining human readibility and a user defined schema. Doing so will allow State Department users (and those of other organizations), to create datasets that function identically to datasets that cann't be easily shared. Bogus data will not consist of random strings numbers or strings. Numbers will be numbers, strings will be strings, names will be names, dates will be dates, and locations will be locations. However, all data will be fake not just random.

Users will be able to select from a list of available field types:
* Country (randomly assign a country)
* City (would return a city name from within the assigned country)
* Names (randomly assign a name)
* Date (randomly assign a date; option where a user could limit random dates to within a range)
* Date Before (add ## days to Date)
* Date After (subtract ## days from Date)
* Number (randomly assign a number; allow user to provide max/min constraints)
* From List (user provides a list, script randomly assigns to records; this could be used for fields like Title, Bureau, etc.)
* Formatted String (use can provide formatting, such as Variable_1 + Format_String_1 + Variable 2 + Format_String_2 + Variable_3 + Format_String_3 + Variable 4 + Format_String_4 which could generate something like "8(7/32)6"; we would need to limit some of the options and allow for the type of variable to be specified)
* From List with Formatted String(assign from a user provided list + a formatted string: Language_From_List + Variable_1 + Format_String_1 + Variable_2; we would need to limit some of the options and allow for the type of variable to be specified)

User could provide their own titles to fields.<br>
Users can select the total number of fields to create and rows to populate.<br>
Export format should be CSV (maybe JSON too?)<br>

Advantages to this method, as opposed to using an input dataset to generate an output dataset:
* We could host this as a tool available to the public!
* No security issues from people uploading datasets that they should really not be uploading.
* Makes the whole thing really, really flexible.
