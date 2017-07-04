#!/usr/bin/env bash

cd module

string="
        <select1 ref=\"Entity_Types\">
          <label>{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Column\">
              <label>{Select_Column}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_Column\/>
                <\/Col_1>
              <\/Colgroup_1>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

cat << EOF >> english.0.properties
All=All
Select_Column=Select Column
EOF
rm ui_schema.xml.original
