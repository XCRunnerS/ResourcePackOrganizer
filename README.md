# Resource Pack Organizer

## Known Issues

Issue | Priority | Difficulty
-|- | -
Selected Packs n folders dont save on reload | medium | hard (recode pack saving)
Cannot open MC Pack Dir | High | Low (should be a typo fix, if you use macos or linux let me know if the issue exists there as well!)

## Project license

The source code and binaries are released under [MPL 2.0](https://github.com/chylex/Resource-Pack-Organizer/blob/master/LICENSE).

~~The folder icon asset is made by FatCow (<http://fatcow.com/free-icons>) and licensed under [CC BY 3.0 US](https://creativecommons.org/licenses/by/3.0/us/legalcode).~~

Icons changed to be custom by XCRunnerS, MIT license

## XCRunnerS's Plans

- work on this document
- change assets directory
- actually try to get this release out (looking at forks, I see there are a few forks that aimed to fix these issues, but they dont have releases)

## Changes

I changed the folder icon, I felt like a custom icon would work better, and I made it a 16x file instead of 32x or larger. I also added a back arrow for folders that are the back button!

## Project setup guide

In order to setup a workspace to play around with the source code, you can get the code through any means github allows through the `code` button

Once you cloned the repository, run `gradlew tasks` and see what best applies for you to make changes, you will probably want to run `gradlew setupDecomWorkspace` and `gradlew idea` or `eclipse` depending on your IDE.

## Versions and Alternatives

This is based off of **Chylex's** 1.0.3 and 1.0.0 releases

Name + Link | Notes |
-|-
[Chylex Version](https://respacks.chylex.com) | goes up to 1.16.3, old versions dont work with skies
[aycy resource pack manager](https://youtu.be/OQZFWrrEcYM) | works with skies, different GUI, some odd behavior sometimes |
[naturecodevoid revamp](https://github.com/naturecodevoid/ResourcePackOrganizerRevamp) | very similar to my version, only reverts the once change
[XCRunnerS Version](https://github.com/XCRunnerS/ResourcePackOrganizer) | this, works with skies, different folder assets
