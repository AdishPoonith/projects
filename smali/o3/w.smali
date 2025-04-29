.class public final synthetic Lo3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/o;


# static fields
.field public static final synthetic j:Lo3/w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/w;

    invoke-direct {v0}, Lo3/w;-><init>()V

    sput-object v0, Lo3/w;->j:Lo3/w;

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

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lo3/u$c;->f(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
