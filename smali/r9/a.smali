.class public Lr9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lr9/d;

.field static final b:Lr9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lr9/d;

    const-string v1, ""

    const-wide/high16 v2, -0x8000000000000000L

    invoke-direct {v0, v1, v2, v3}, Lr9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lr9/a;->a:Lr9/d;

    new-instance v0, Lr9/b;

    invoke-direct {v0, v2, v3}, Lr9/b;-><init>(J)V

    sput-object v0, Lr9/a;->b:Lr9/b;

    return-void
.end method

.method protected constructor <init>(Lr9/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lr9/a;->a:Lr9/d;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "nope"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method protected a(Ljava/lang/String;J)Lr9/d;
    .locals 0

    sget-object p1, Lr9/a;->a:Lr9/d;

    return-object p1
.end method

.method protected b(Ljava/lang/String;Lr9/d;)V
    .locals 0

    return-void
.end method

.method protected c(Lr9/b;)V
    .locals 0

    return-void
.end method

.method protected d()Lr9/b;
    .locals 1

    sget-object v0, Lr9/a;->b:Lr9/b;

    return-object v0
.end method

.method protected e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected f(Ljava/lang/String;Lr9/d;)V
    .locals 0

    return-void
.end method

.method protected g(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected h(Ljava/lang/String;Lr9/d;)V
    .locals 0

    return-void
.end method
