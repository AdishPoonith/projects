.class public final synthetic Lp0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lp0/f0$b;


# direct methods
.method public synthetic constructor <init>(Lp0/f0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/c0;->a:Lp0/f0$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/c0;->a:Lp0/f0$b;

    invoke-static {v0}, Lp0/f0;->d(Lp0/f0$b;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
