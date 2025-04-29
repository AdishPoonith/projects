.class public final synthetic Lp1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp1/m;


# direct methods
.method public synthetic constructor <init>(Lp1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/i;->j:Lp1/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp1/i;->j:Lp1/m;

    invoke-static {v0}, Lp1/m;->b2(Lp1/m;)V

    return-void
.end method
