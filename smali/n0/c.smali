.class public final synthetic Ln0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/d;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/c;->j:Ln0/d;

    iput-object p2, p0, Ln0/c;->k:Ljava/lang/String;

    iput-object p3, p0, Ln0/c;->l:Ljava/lang/String;

    iput-object p4, p0, Ln0/c;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ln0/c;->j:Ln0/d;

    iget-object v1, p0, Ln0/c;->k:Ljava/lang/String;

    iget-object v2, p0, Ln0/c;->l:Ljava/lang/String;

    iget-object v3, p0, Ln0/c;->m:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Ln0/d;->f(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
