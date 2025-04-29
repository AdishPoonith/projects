.class public final synthetic Lf1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic j:Lf1/q0;


# direct methods
.method public synthetic constructor <init>(Lf1/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/n0;->j:Lf1/q0;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lf1/n0;->j:Lf1/q0;

    invoke-static {v0, p1}, Lf1/q0;->b(Lf1/q0;Landroid/content/DialogInterface;)V

    return-void
.end method
