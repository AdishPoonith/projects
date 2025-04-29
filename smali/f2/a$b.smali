.class final Lf2/a$b;
.super Lf2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field public final b:Lp3/a0;


# direct methods
.method public constructor <init>(ILp3/a0;)V
    .locals 0

    invoke-direct {p0, p1}, Lf2/a;-><init>(I)V

    iput-object p2, p0, Lf2/a$b;->b:Lp3/a0;

    return-void
.end method
