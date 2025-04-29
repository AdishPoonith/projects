.class public final synthetic Lp6/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/f0;

.field public final synthetic k:Li9/u0;


# direct methods
.method public synthetic constructor <init>(Lp6/f0;Li9/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/c0;->j:Lp6/f0;

    iput-object p2, p0, Lp6/c0;->k:Li9/u0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/c0;->j:Lp6/f0;

    iget-object v1, p0, Lp6/c0;->k:Li9/u0;

    invoke-static {v0, v1}, Lp6/f0;->f(Lp6/f0;Li9/u0;)V

    return-void
.end method
