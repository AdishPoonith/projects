.class final Lz1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/h;->a:Ljava/lang/String;

    return-void
.end method

.method public static b(Lp3/a0;)Lz1/h;
    .locals 2

    new-instance v0, Lz1/h;

    invoke-virtual {p0}, Lp3/a0;->a()I

    move-result v1

    invoke-virtual {p0, v1}, Lp3/a0;->D(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lz1/h;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x6e727473

    return v0
.end method
