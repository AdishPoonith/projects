.class abstract Lp6/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(II)Lp6/v0$a;
    .locals 1

    new-instance v0, Lp6/k;

    invoke-direct {v0, p0, p1}, Lp6/k;-><init>(II)V

    return-object v0
.end method

.method static c(ILp6/p;)Lp6/v0$a;
    .locals 0

    invoke-virtual {p1}, Lp6/p;->a()I

    move-result p1

    invoke-static {p0, p1}, Lp6/v0$a;->a(II)Lp6/v0$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method abstract b()I
.end method

.method abstract d()I
.end method
