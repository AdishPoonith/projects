.class public final synthetic Ll6/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/i0;

.field public final synthetic k:Li6/j;

.field public final synthetic l:Ll6/h4;

.field public final synthetic m:I

.field public final synthetic n:Ld6/e;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Li6/j;Ll6/h4;ILd6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/d0;->j:Ll6/i0;

    iput-object p2, p0, Ll6/d0;->k:Li6/j;

    iput-object p3, p0, Ll6/d0;->l:Ll6/h4;

    iput p4, p0, Ll6/d0;->m:I

    iput-object p5, p0, Ll6/d0;->n:Ld6/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ll6/d0;->j:Ll6/i0;

    iget-object v1, p0, Ll6/d0;->k:Li6/j;

    iget-object v2, p0, Ll6/d0;->l:Ll6/h4;

    iget v3, p0, Ll6/d0;->m:I

    iget-object v4, p0, Ll6/d0;->n:Ld6/e;

    invoke-static {v0, v1, v2, v3, v4}, Ll6/i0;->g(Ll6/i0;Li6/j;Ll6/h4;ILd6/e;)V

    return-void
.end method
