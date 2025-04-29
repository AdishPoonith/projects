.class public final synthetic Lp1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic j:Lp1/m;


# direct methods
.method public synthetic constructor <init>(Lp1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/f;->j:Lp1/m;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lp1/f;->j:Lp1/m;

    invoke-static {v0, p1, p2}, Lp1/m;->a2(Lp1/m;Landroid/content/DialogInterface;I)V

    return-void
.end method
