.class public abstract Lna/o;
.super Lkotlinx/coroutines/internal/o;
.source "SourceFile"

# interfaces
.implements Lna/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/o;",
        "Lna/q<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/o;-><init>()V

    return-void
.end method


# virtual methods
.method public A()Lkotlinx/coroutines/internal/b0;
    .locals 1

    sget-object v0, Lna/b;->b:Lkotlinx/coroutines/internal/b0;

    return-object v0
.end method

.method public abstract B(Lna/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna/j<",
            "*>;)V"
        }
    .end annotation
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lna/o;->A()Lkotlinx/coroutines/internal/b0;

    move-result-object v0

    return-object v0
.end method
