.class final Lh2/x;
.super Lx1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/x$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Lp3/j0;JJ)V
    .locals 16

    new-instance v1, Lx1/a$b;

    invoke-direct {v1}, Lx1/a$b;-><init>()V

    new-instance v2, Lh2/x$b;

    const/4 v0, 0x0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0}, Lh2/x$b;-><init>(Lp3/j0;Lh2/x$a;)V

    const-wide/16 v3, 0x1

    add-long v7, p2, v3

    const-wide/16 v5, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v13, 0xbc

    const/16 v15, 0x3e8

    move-object/from16 v0, p0

    move-wide/from16 v3, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v0 .. v15}, Lx1/a;-><init>(Lx1/a$d;Lx1/a$f;JJJJJJI)V

    return-void
.end method

.method static synthetic j([BI)I
    .locals 0

    invoke-static {p0, p1}, Lh2/x;->k([BI)I

    move-result p0

    return p0
.end method

.method private static k([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method
