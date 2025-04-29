.class public final synthetic Ll6/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Ll6/i2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll6/i2;

    invoke-direct {v0}, Ll6/i2;-><init>()V

    sput-object v0, Ll6/i2;->j:Ll6/i2;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln6/g;

    check-cast p2, Ln6/g;

    invoke-static {p1, p2}, Ll6/s2;->t(Ln6/g;Ln6/g;)I

    move-result p1

    return p1
.end method
