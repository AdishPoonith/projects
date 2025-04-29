.class Ld7/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/p;->f(Li9/d;)Ld7/p$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp9/b$a<",
        "Ld7/p$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li9/d;Li9/c;)Lp9/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ld7/p$a;->b(Li9/d;Li9/c;)Ld7/p$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Li9/d;Li9/c;)Ld7/p$b;
    .locals 2

    new-instance v0, Ld7/p$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Ld7/p$b;-><init>(Li9/d;Li9/c;Ld7/p$a;)V

    return-object v0
.end method
