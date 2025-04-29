.class public final synthetic Lo3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/o;


# static fields
.field public static final synthetic j:Lo3/v;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/v;

    invoke-direct {v0}, Lo3/v;-><init>()V

    sput-object v0, Lo3/v;->j:Lo3/v;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lo3/u$c;->g(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
