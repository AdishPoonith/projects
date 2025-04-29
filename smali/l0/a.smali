.class Ll0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/a;->a:Landroid/content/Context;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;
    .locals 1

    new-instance v0, Landroid/location/Geocoder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p0, p1}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0, p0}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method b(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll0/a;->a:Landroid/content/Context;

    invoke-static {v0, p2}, Ll0/a;->a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;

    move-result-object p2

    const/4 v0, 0x5

    invoke-virtual {p2, p1, v0}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method c(DDLjava/util/Locale;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll0/a;->a:Landroid/content/Context;

    invoke-static {v0, p5}, Ll0/a;->a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;

    move-result-object v1

    const/4 v6, 0x5

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
