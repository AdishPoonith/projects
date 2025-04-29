.class public final synthetic Ls1/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/j1;

.field public final synthetic k:Ls1/g3;


# direct methods
.method public synthetic constructor <init>(Ls1/j1;Ls1/g3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/i1;->j:Ls1/j1;

    iput-object p2, p0, Ls1/i1;->k:Ls1/g3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/i1;->j:Ls1/j1;

    iget-object v1, p0, Ls1/i1;->k:Ls1/g3;

    invoke-static {v0, v1}, Ls1/j1;->f(Ls1/j1;Ls1/g3;)V

    return-void
.end method
