.class public final synthetic Ls0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp0/j0;


# direct methods
.method public synthetic constructor <init>(Lp0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/f;->j:Lp0/j0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls0/f;->j:Lp0/j0;

    invoke-static {v0}, Ls0/g;->a(Lp0/j0;)V

    return-void
.end method
