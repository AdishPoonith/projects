.class public final synthetic Lp6/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lp6/f0;


# direct methods
.method public synthetic constructor <init>(Lp6/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/e0;->a:Lp6/f0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp6/e0;->a:Lp6/f0;

    invoke-static {v0}, Lp6/f0;->d(Lp6/f0;)Li9/u0;

    move-result-object v0

    return-object v0
.end method
