.class public final synthetic Ln0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/q;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(Ln0/q;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/o;->j:Ln0/q;

    iput-boolean p2, p0, Ln0/o;->k:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/o;->j:Ln0/q;

    iget-boolean v1, p0, Ln0/o;->k:Z

    invoke-static {v0, v1}, Ln0/q;->k(Ln0/q;Z)V

    return-void
.end method
