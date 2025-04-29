.class public final synthetic Lr0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:Lr0/f;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lr0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/e;->j:Landroid/view/View;

    iput-object p2, p0, Lr0/e;->k:Lr0/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr0/e;->j:Landroid/view/View;

    iget-object v1, p0, Lr0/e;->k:Lr0/f;

    invoke-static {v0, v1}, Lr0/f;->a(Landroid/view/View;Lr0/f;)V

    return-void
.end method
