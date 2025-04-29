.class public final Ld7/p$b;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/a<",
        "Ld7/p$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Li9/d;Li9/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/a;-><init>(Li9/d;Li9/c;)V

    return-void
.end method

.method synthetic constructor <init>(Li9/d;Li9/c;Ld7/p$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld7/p$b;-><init>(Li9/d;Li9/c;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Li9/d;Li9/c;)Lp9/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ld7/p$b;->g(Li9/d;Li9/c;)Ld7/p$b;

    move-result-object p1

    return-object p1
.end method

.method protected g(Li9/d;Li9/c;)Ld7/p$b;
    .locals 1

    new-instance v0, Ld7/p$b;

    invoke-direct {v0, p1, p2}, Ld7/p$b;-><init>(Li9/d;Li9/c;)V

    return-object v0
.end method
