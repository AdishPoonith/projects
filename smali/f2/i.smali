.class public final synthetic Lf2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# static fields
.field public static final synthetic j:Lf2/i;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lf2/i;

    invoke-direct {v0}, Lf2/i;-><init>()V

    sput-object v0, Lf2/i;->j:Lf2/i;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/o;

    invoke-static {p1}, Lf2/k;->k(Lf2/o;)Lf2/o;

    move-result-object p1

    return-object p1
.end method
