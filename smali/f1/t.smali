.class public final synthetic Lf1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lf1/v$b;


# direct methods
.method public synthetic constructor <init>(Lf1/v$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/t;->j:Lf1/v$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/t;->j:Lf1/v$b;

    invoke-static {v0}, Lf1/v;->b(Lf1/v$b;)V

    return-void
.end method
