.class public final synthetic Ln0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/q;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Ln0/q;ZLjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/p;->j:Ln0/q;

    iput-boolean p2, p0, Ln0/p;->k:Z

    iput-object p3, p0, Ln0/p;->l:Ljava/lang/String;

    iput-boolean p4, p0, Ln0/p;->m:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ln0/p;->j:Ln0/q;

    iget-boolean v1, p0, Ln0/p;->k:Z

    iget-object v2, p0, Ln0/p;->l:Ljava/lang/String;

    iget-boolean v3, p0, Ln0/p;->m:Z

    invoke-static {v0, v1, v2, v3}, Ln0/q;->a(Ln0/q;ZLjava/lang/String;Z)V

    return-void
.end method
