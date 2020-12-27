SUMMARY = "Web-based interface for the MOD."
SECTION = "multimedia"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5abed640d912caca185601d2312815e"

RDEPENDS_${PN} = "python3-json python3-setuptools python3-pyserial pystache python3-pillow python3-tornado"
DEPENDS = "lilv jack alsa-lib"

SRCREV = "e565be40f9bc3d4fb43b2f238b668192d6936eab"

SRC_URI = "git://github.com/moddevices/mod-ui.git;branch=master \
           "

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/mod/ \
		/usr/bin/mod-ui"
INSANE_SKIP_${PN} = "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

inherit setuptools3

